package war;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "war.sys.dao")//使用mybatis-plus要指明mapper扫描路径
//@EnableAutoConfiguration
@SpringBootApplication
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
