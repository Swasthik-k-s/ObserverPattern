package com.observer;

public class Observer2<T> implements Observer<T> {
	@Override
	public void onUpdate(T data) {
		if(data instanceof Data) {
			System.out.println(((Data)data).getData());
		}
	}
}