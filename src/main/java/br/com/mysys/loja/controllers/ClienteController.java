package br.com.mysys.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mysys.loja.dao.ClienteDAO;
import br.com.mysys.loja.dao.EnderecoDAO;
import br.com.mysys.loja.enums.CadastroStatus;
import br.com.mysys.loja.enums.Estados;
import br.com.mysys.loja.enums.TipoContribuinte;
import br.com.mysys.loja.enums.TipoPessoa;
import br.com.mysys.loja.enums.TipoRegimeTributario;
import br.com.mysys.loja.models.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteDAO clienteDao;
	
	@Autowired 
	private EnderecoDAO enderecoDAO;
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.addValidators(new ClienteValidation());
//		binder.addValidators(new EnderecoValidation());
//	}

	@RequestMapping(method = RequestMethod.GET)
	@Cacheable(value = "ClientesHome")
	public ModelAndView menu() {
		ModelAndView mav = new ModelAndView("cadastros/cliente/clienteMenu");
		List<Cliente> clientes = clienteDao.lista();
		mav.addObject("clientes", clientes);
		return mav;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo(Cliente cliente) {
		ModelAndView modelAndView = new ModelAndView("/cadastros/cliente/novoCliente");
			
		populaObjetos(modelAndView);
		
		return modelAndView;
	}
	
	

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView modelAndView = new ModelAndView("/cadastros/cliente/editCliente");

		Cliente cliente = clienteDao.find(id);
		modelAndView.addObject("cliente", cliente);
		
		populaObjetos(modelAndView);
		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	@CacheEvict(value="ClientesHome", allEntries=true)
	public ModelAndView inserir(@Valid Cliente cliente, BindingResult result, RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return novo(cliente);
		}
		
		enderecoDAO.persist(cliente.getEndereco());
		clienteDao.persist(cliente);
		
		redirectAttributes.addFlashAttribute("message", "Cliente cadastrado com sucesso!");
		
		return new ModelAndView("redirect:/clientes");
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	@CacheEvict(value="ClientesHome", allEntries=true)
	public ModelAndView alterar(@Valid Cliente cliente, BindingResult result, RedirectAttributes redirectAttributes) {
				
		if (result.hasErrors()) {
			return edit(cliente.getId());
		}
		
		System.out.println(cliente);
		enderecoDAO.merge(cliente.getEndereco());
		clienteDao.merge(cliente);
		
		redirectAttributes.addFlashAttribute("message", "Cliente alterado com sucesso!");
		
		return new ModelAndView("redirect:/clientes");
	}
	
	@RequestMapping("/remove/{id}")
	@CacheEvict(value="ClientesHome", allEntries=true)
	public ModelAndView delete(@PathVariable("id") Integer id) {
		Cliente finded = clienteDao.find(id);
		clienteDao.deleteById(finded);
		return new ModelAndView("redirect:/clientes");
	}
	
	private void populaObjetos(ModelAndView modelAndView) {
		List<CadastroStatus> listaStatus = CadastroStatus.lista();
		modelAndView.addObject("listaStatus", listaStatus);
		
		List<TipoContribuinte> listaTipoContribuinte = TipoContribuinte.lista();
		modelAndView.addObject("listaTipoContribuinte", listaTipoContribuinte);
		
		List<TipoPessoa> listaTipoPessoa = TipoPessoa.lista();
		modelAndView.addObject("listaTipoPessoa", listaTipoPessoa);
		
		List<TipoRegimeTributario> listaTipoRegimeTributario = TipoRegimeTributario.lista();
		modelAndView.addObject("listaTipoRegimeTributario", listaTipoRegimeTributario);
		
		List<Estados> listaEstados = Estados.lista();
		modelAndView.addObject("listaEstados", listaEstados);
		
		
	}
}

