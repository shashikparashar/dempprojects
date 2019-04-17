package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	
	private List<Topic> topics =new ArrayList<>(Arrays.asList(
					new Topic("spring","spring framework","spring framework description"),
					new Topic("hibernate","hibernate framework","hibernate framework description"),
					new Topic("other","other framework","other framework description")
					));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		//return new Topic("hibernate","hibernate framework","hibernate framework description");
		System.out.println("\n\n\n"+id+"\n\n\n");
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		

		/*System.out.println("\n\n\n"+id+"\n\n\n");
		return topics.stream().filter(t ->
		{
			System.out.println(t.getId());
			System.out.println(id);
			boolean test =  t.getId().equals(id);
			System.out.println(test);
			return test;
			 
		}).findFirst().get();*/
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(String id,Topic topic)
	{
		for(int i=0; i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equalsIgnoreCase(id))
				topics.set(i, topic);
				return;
		}
	}
	public void dalateTopic(String id) {
		for(int i=0; i<topics.size();i++)
		{
			topics.removeIf(t -> t.getId().equals(id));
		}
		
	}

}
