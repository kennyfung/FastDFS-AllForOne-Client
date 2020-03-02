package com.kenny.fastdfsallforoneclient;
import com.kenny.fastdfsallforoneclient.util.FastdfsClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/**
 * @auther: Kenny
 * @date: 2020/3/2 15:09
 * @description:
 */
//@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FastdfsAllforoneClientApplication.class)
//@ContextConfiguration(locations = {"classpath:fastdfs-client.properties"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//spring boot会默认加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration类使用了@Configuration注解向spring注入了dataSource bean,因为工程中没有关于dataSource相关的配置信息，当spring创建dataSource bean因缺少相关的信息就会报错
public class FastdfsClientTest {

    //上传文件
    @Test
    public void testUpload() {
        //本地文件，要上传的文件
        String local_filename = "D:\\aaa.jpg";
        FastdfsClient.fastDFSUpload(local_filename);

        //FastdfsClient.fastDFSDownload("M00/00/00/wKhwh15b09aAEjCSAAF_OTT3YjE699.jpg");
        //FastdfsClient.fastDFSGetFileInfo("M00/00/00/wKhwh15b09aAEjCSAAF_OTT3YjE699.jpg");
        //FastdfsClient.fastDFSGetFileInfo("M00/00/00/wKhwiF5cr7WAKPWHAAF_OTT3YjE662.jpg");
    }

}
