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
	            throw new DivideException("0���� ������ ���� ������� �ʽ��ϴ�.!");
	        }
	        System.out.println(this.left/this.right);
	    }


}
