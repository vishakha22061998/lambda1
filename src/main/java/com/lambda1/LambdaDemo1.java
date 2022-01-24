package com.lambda1;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaDemo1 implements RequestHandler<Object,String>
{
	@Override
	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input:" + input);
		//System.out.println("Hello World!");
		return "Hello World!.......";
	}

	}
	

