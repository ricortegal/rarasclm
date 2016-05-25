/*
 * @autor Ricardo Ortega [rortega@externas.jccm.es]
 *  
 */
package es.jclm.cs.rarasclm.listeners;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import es.jclm.cs.rarasclm.entities.DatosAuxiliaresCacheados;
import es.jclm.cs.rarasclm.entities.IBaseModelView;
import es.jclm.cs.rarasclm.service.EnfermedadRaraCie10Service;
import es.jclm.cs.rarasclm.service.EnfermedadRaraCie9mcService;
import es.jclm.cs.rarasclm.service.EnfermedadRaraService;


// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving dataContextRarasClmApp events. The class
 * that is interested in processing a dataContextRarasClmApp event implements
 * this interface, and the object created with that class is registered with a
 * component using the component's <code>addDataContextRarasClmAppListener
 * <code> method. When the dataContextRarasClmApp event occurs, that object's
 * appropriate method is invoked.
 *
 * @see DataContextRarasClmAppEvent
 */
public class DataContextRarasClmAppListener implements ApplicationListener<ContextRefreshedEvent> {

	/** The log. */
	static Log log = LogFactory.getLog(DataContextRarasClmAppListener.class.getName());
	
	/** The datos. */
	@Autowired
	private DatosAuxiliaresCacheados datos;
	
	/** The cie9 service. */
	@Autowired
	EnfermedadRaraCie9mcService cie9Service;
	
	/** The cie10 service. */
	@Autowired
	EnfermedadRaraCie10Service cie10Service;
	
	/** The rara service. */
	@Autowired
	EnfermedadRaraService raraService;
	
	/** The base model. */
	@Autowired
	IBaseModelView baseModel;
	

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextRefreshedEvent evt) {
	
		log.info("Generando la estructura de módulos de la aplicación rarasCLM");
		try {
			 //URL urlXml = this.getClass().getResource("resources/spring-web.xml");
			 //String url = urlXml.toString();
		}
		catch(Exception ex) {
			
		}
		
		log.info("Cargando entidades auxiliares de la aplicación de RarasCLM");
		datos.setCie9mcs(cie9Service.getAllEnfermedadesRarasCie9mc(false));
		log.info("Cargada entidades auxiliares CIE9MC");
		datos.setCie10s(cie10Service.getAllEnfermedadesRarasCie10(false));
		log.info("Cargada entidades auxiliares CIE10");
		datos.setEnfRaras(raraService.getAllEnfermedadesRaras(false));
		log.info("Cargada entidades auxiliares Enfermedades Raras");
		
	}

	
	
}
