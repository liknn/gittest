package cn.ssm.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import cn.ssm.domain.MyTestBean;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		MyTestBean tb = (MyTestBean) bf.getBean("myTestBean");

		assertEquals("≤‚ ‘213", tb.getTestStr());
	}
}
