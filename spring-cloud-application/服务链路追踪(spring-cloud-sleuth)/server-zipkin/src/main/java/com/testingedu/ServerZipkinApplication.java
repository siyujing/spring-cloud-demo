package com.testingedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 在spring Cloud为F版本的时候，已经不需要自己构建Zipkin Server了，只需要下载jar即可，
 方法一 安装zipkin linux安装路径：
 wget -O zipkin.jar 'https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec'
 nohup java -jar zipkin.jar &
 访问浏览器localhost:9411（默认端口号9411）

 方法二 下载地址：
 https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
 方法二下载完成后运行jar包,在jar 包路径下执行：java -jar zipkin-server-2.10.1-exec.jar
 访问浏览器localhost:9411

 * */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
    public static void main(String[] args){
        SpringApplication.run(ServerZipkinApplication.class,args);
    }
}
