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
//		//��������
//		poolCfg.setMaxIdle(50);
//		//���������
//		poolCfg . setMaxTotal(100) ;
//		//���ȴ�������
//		poolCfg.setMaxWaitMillis(20000);
//		//ʹ�����ô������ӳ�
//		JedisPool pool = new JedisPool (poolCfg,"192.168.166.129");
//		//�����ӳ��л�ȡ��������
//		Jedis jedis = pool . getResource() ;
		//���������
		//jed��s . auth �� �� p assword �� �� ��
		
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

		System.out.println("redisÿ�������" + i + "��");
	}

}
