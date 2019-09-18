package training.generic;

import java.util.ArrayList;

public class Product<T, M> {
	
	private T kind;
	private M model;
	private ArrayList<T> kindList; 
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public ArrayList<T> getKindList() {
		return kindList;
	}
	public void setKindList(ArrayList<T> kindList) {
		this.kindList = kindList;
	}
}
