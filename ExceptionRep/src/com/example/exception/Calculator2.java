package com.example.exception;

public class Calculator2 {

	int left;
	int right;
	

	 public void setOprands(int left,int right)
	    {
	        this.left=left;
	        this.right=right;
	    }	

	 
	 public void divide(){
	        if(this.right==0)
	        {
	            throw new DivideException("0으로 나누는 것은 혀용되지 않습니다.!");
	        }
	        System.out.println(this.left/this.right);
	    }


}
