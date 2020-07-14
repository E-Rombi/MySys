package br.com.mysys.loja.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mysys.loja.dao.RoleDAO;
import br.com.mysys.loja.dao.UserDAO;
import br.com.mysys.loja.models.Role;
import br.com.mysys.loja.models.Usuario;
import br.com.mysys.loja.validation.UsuarioValidation;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UserDAO usuarioDao;
	
	@Autowired
	private RoleDAO roleDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new UsuarioValidation());
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@Cacheable(value = "UsuariosHome")
	public ModelAndView menu() {
		ModelAndView modelAndView = new ModelAndView("/cadastros/usuario/usuarioMenu");
		List<Usuario> usuarios = usuarioDao.lista();
		modelAndView.addObject("usuarios", usuarios);
		return modelAndView;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo(Usuario usuario) {
		ModelAndView modelAndView = new ModelAndView("/cadastros/usuario/novoUsuario");
		modelAndView.addObject("roles", roleDao.lista());
			
		return modelAndView;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("/cadastros/usuario/editUsuario");

		Usuario user = usuarioDao.find(id);
		mav.addObject("usuario", user);
		mav.addObject("roles", roleDao.lista());
		
		return mav;
		
	}
	
	
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	@CacheEvict(value="UsuariosHome", allEntries=true)
	public ModelAndView inserir(@Valid Usuario usuario, BindingResult result, String permissaoFinal,  RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return novo(usuario);
		}
		
		String[] split = permissaoFinal.split("|");
		List<Role> rolesFinal = new ArrayList<Role>();
		for(int i = 0; i < permissaoFinal.split("|").length; i++) {
			rolesFinal.add(roleDao.find(split[i]));
		}
		
		System.out.println("rolesFINAL = " + rolesFinal);
		usuario.setRoles(rolesFinal);
		usuarioDao.persist(usuario);
		
		redirectAttributes.addFlashAttribute("message", "Usuário cadastrado com sucesso!");
		
		return new ModelAndView("redirect:/usuarios");
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	@CacheEvict(value="UsuariosHome", allEntries=true)
	public ModelAndView alterar(@Valid Usuario usuario, BindingResult result, String permissaoFinal,  RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return edit(usuario.getId());
		}
		
		usuarioDao.merge(usuario);
		
		redirectAttributes.addFlashAttribute("message", "Usuário alterado com sucesso!");
		
		return new ModelAndView("redirect:/usuarios");
	}
	
	@RequestMapping("/remove/{id}")
	@CacheEvict(value="UsuariosHome", allEntries=true)
	public ModelAndView delete(@PathVariable("id") Integer id) {
		usuarioDao.deleteById(id);
		return new ModelAndView("redirect:/usuarios");
	}
	
	
	
}
