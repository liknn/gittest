package cn.ssm.web;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		JedisPoolConfig poolCfg =new JedisPoolConfig() ;
//		//最大空闲数
//		poolCfg.setMaxIdle(50);
//		//最大连接数
//		poolCfg . setMaxTotal(100) ;
//		//最大等待毫秒数
//		poolCfg.setMaxWaitMillis(20000);
//		//使用配置创建连接池
//		JedisPool pool = new JedisPool (poolCfg,"192.168.166.129");
//		//从连接池中获取单个连接
//		Jedis jedis = pool . getResource() ;
		//如果需密码
		//jed工s . auth （ ” p assword ” ） ；
		
		Jedis jedis = new Jedis("192.168.166.129", 6379);
		jedis.auth("123456");

		int i = 0;

		try {
			long start = System.currentTimeMillis();
			while (true) {
				long end = System.currentTimeMillis();
				if (end - start >= 1000) {
					break;
				}
				i++;
				jedis.set("test1" + i, String.valueOf(i));

			}

		} finally {
			jedis.close();
		}

		System.out.println("redis每秒操作：" + i + "次");
	}

}
