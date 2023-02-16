package ch.hug.service.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;


public class DroolsService {

	private final KieContainer kieContainer;


	public  DroolsService() {
		KieServices kieServices = KieServices.Factory.get();
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(ResourceFactory.newClassPathResource("ch/hug/service/drools/Rules.xlsx", getClass()));
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		kieContainer =  kieServices.newKieContainer(kieModule.getReleaseId());
	}


	public void fireRules(DiscountRequest request) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(request);
		kieSession.fireAllRules();
		kieSession.dispose();
	}

}
