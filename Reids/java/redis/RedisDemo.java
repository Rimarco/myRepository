package redis;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.Jedis;

public class RedisDemo {
	ClassPathXmlApplicationContext ctx;

	/**
	 * 连接redis
	 * 不需要Before，After
	 */
	@Test
	public void setRedis(){
		Jedis jedis=new Jedis("176.147.17.44");
		
		String value=jedis.get("msg");
		System.out.println(value);
		jedis.close();
	} 
	
	@Test
	public void SpringRedisTest(){
		
		RedisTemplate<String,Object> template=ctx.getBean("redisTemplate",RedisTemplate.class);
		//opsForValue()返回字符串类型操作
		//template.opsForValue().set("demo","Hello World!");
	//	String str=(String)template.opsForValue().get("demo");
		//System.out.println(str);
		
		User user=new User(1,"Tom",29);
		template.opsForValue().set("loginUser",user,20,TimeUnit.SECONDS);
	}
	
	@Test
	public void SpringRedisTest2(){
		
		RedisTemplate<String,Object> template=ctx.getBean("redisTemplate",RedisTemplate.class);
		
		User user=(User)template.opsForValue().get("loginUser");
		System.out.println(user);
	}
	
	
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-redis.xml");
		
	}
	@After
	public void destory(){
		ctx.close();
	}
}
