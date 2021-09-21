package com.observer;

public interface Observer<T> {
	public void onUpdate(T data);
}
