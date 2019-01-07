package com.service.imp;

import com.entity.Infor;
import com.service.InforHello;

public class InforHelloServicImpl  implements InforHello{

	public void hello() {
    Infor in=new Infor();
    in.setName("hello");
    in.setPassword("hello");
    System.out.println(in);
	}

}
