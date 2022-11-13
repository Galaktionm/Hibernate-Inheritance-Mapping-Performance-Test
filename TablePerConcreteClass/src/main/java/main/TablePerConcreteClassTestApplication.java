package main;

import java.util.Date;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import main.entities.*;

import main.repositories.ItemRepository;

@SpringBootApplication
public class TablePerConcreteClassTestApplication {
	
	@Autowired
	private EntityManagerFactory emf;
	@Autowired
	private ItemRepository repo;
	
	private static Random rand=new Random();

	public static void main(String[] args) {
		SpringApplication.run(TablePerConcreteClassTestApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner loadData() {
		return args->{
			Logger logger=LoggerFactory.getLogger("TPC");
			String[] names= {"NameA", "NameB", "NameC", "NameD", "NameE"};	
			int n=names.length;
			String[] description= {"DescriptionA", "DescriptionB", "DescriptionC", "DescriptionD"};			
			int d=description.length;
			String[] info= {"InfoA", "InfoB", "InfoC", "InfoD", "InfoE"};
			int inf=info.length;
			
			
			EntityManager em=emf.createEntityManager();
			em.getTransaction().begin();
			logger.info("Started persisting data");			
			Date start=new Date();
			for(int i=0; i<100; i++) {
				Item itemA1=new ItemA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)]);
				Item itemAA1=new ItemAA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemAB1=new ItemAB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemAC1=new ItemAC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				repo.save(itemA1);
				repo.save(itemAA1);
				repo.save(itemAB1);
				repo.save(itemAC1);
				Item itemB1=new ItemB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)]);
				Item itemBA1=new ItemBA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemBB1=new ItemBB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemBC1=new ItemBC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				repo.save(itemB1);
				repo.save(itemBA1);
				repo.save(itemBB1);
				repo.save(itemBC1);
				Item itemC1=new ItemC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)]);	
				Item itemCA1=new ItemCA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemCB1=new ItemCB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemCC1=new ItemCC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				repo.save(itemC1);
				repo.save(itemCA1);
				repo.save(itemCB1);
				repo.save(itemCC1);
				Item itemD1=new ItemD(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)]);
				Item itemDA1=new ItemDA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemDB1=new ItemDB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemDC1=new ItemDC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				repo.save(itemD1);
				repo.save(itemDA1);
				repo.save(itemDB1);
				repo.save(itemDC1);
				Item itemE1=new ItemE(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)]);
				Item itemEA1=new ItemEA(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemEB1=new ItemEB(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				Item itemEC1=new ItemEC(names[rand.nextInt(n)], rand.nextInt(100000),
						description[rand.nextInt(d)], info[rand.nextInt(inf)]);
				repo.save(itemE1);
				repo.save(itemEA1);	
				repo.save(itemEB1);
				repo.save(itemEC1);
			}
			Date end=new Date();
			logger.info("Persisting data finished");
			logger.info("Time in milliseconds: {}", end.getTime()-start.getTime());
			logger.info("Items added: {}", repo.findAll().size());		
			em.getTransaction().commit();
			em.close();
			
		};
	}

}
