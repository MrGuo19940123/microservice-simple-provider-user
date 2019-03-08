package com.leo.microservicesimpleprovideruser;

import com.leo.microservicesimpleprovideruser.domain.Apple;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.log.LogInputStream;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceSimpleProviderUserApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 * 查询所有的隐藏文件
	 */
	@Test
	public void Test1(){
		File[] hiddenFile = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		for (int i = 0; i < hiddenFile.length; i++) {
			File file = hiddenFile[i];
			System.out.println(file+"====================");
		}
	}


	@Test
	public void Test2(){
		// 因此只需用Java 8的方法引用::语法（即“把这个方法作为值”）将其传给listFiles方法；
		File[] hiddenFile = new File("D://").listFiles(File::isHidden);
		for (int i = 0; i < hiddenFile.length; i++) {
			File file = hiddenFile[i];
			System.out.println(file);
		}
    }

    // 生成list循环:itli
	// 增强for循环快捷键:iter
    @Test
    public List<Apple> Test3(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}

	/**
	 * 测试List
	 */
	@Test
	public void Test4(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		list.add("");

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
	}




}
