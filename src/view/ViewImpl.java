package view;

import javax.swing.*;

import interfaces.View;

public class ViewImpl implements View{
	private MyFrame frames[];
	
	public ViewImpl() {
		this.frames = new MyFrame[2];
		this.frames[0] = new MyFrame(0);
		this.frames[1] = new MyFrame(1);
	}
	
	@Override
	public MyFrame[] getFrames() {
		// TODO Auto-generated method stub
		return this.frames;
	}
}
