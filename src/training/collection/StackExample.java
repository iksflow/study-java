package training.collection;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 마지막에 넣은것이 가장 먼저나온다. LIFO(Last In First Out)
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(String.format("꺼낸 동전 : %d", coin.getValue()));
		}
	}
}
