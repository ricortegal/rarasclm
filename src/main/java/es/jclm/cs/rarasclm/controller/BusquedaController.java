package es.jclm.cs.rarasclm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.jclm.cs.rarasclm.anotations.RarasClmItemMenu;
import es.jclm.cs.rarasclm.anotations.RarasClmItemModulo;
import es.jclm.cs.rarasclm.entities.BusquedaModelView;
import es.jclm.cs.rarasclm.service.LocalizacionesService;

@Controller
@RequestMapping("/busqueda")
@RarasClmItemModulo(caption="Búsqueda",deno="Búsqueda",modulo="busqueda",orden=1)
@RarasClmItemMenu(caption="Búsqueda",deno="Búsqueda",modulo="busqueda",orden=1)
@SessionAttributes("busqueda")
public class BusquedaController extends BaseController {
	
	@Autowired
	LocalizacionesService servicioLocalizaciones;

	@RequestMapping(method = RequestMethod.GET)
	public String busqueda(Model model) {
		
		BusquedaModelView busquedaModel = new BusquedaModelView();
		model.addAttribute("busqueda", busquedaModel);
		
		if(busquedaModel.getMunicipio().length()==5 && busquedaModel.getMunicipio().equals("99999"))
			model.addAttribute("municipiosProvinciaResidencia",servicioLocalizaciones.getMunicipioDeProvincia(busquedaModel.getMunicipio().substring(0, 2)));
		
		return "busqueda/index-busqueda";
	}
	
	
	
}
