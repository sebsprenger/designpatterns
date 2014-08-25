package designpatterns.client;

import java.util.ArrayList;
import java.util.List;

import designpatterns.concrete.UnsharedConcreteFlyweight;
import designpatterns.factory.ProductFactory;
import designpatterns.flyweight.Flyweight;

public class Client {

	public static void main(String[] args) {

		ProductFactory factory = new ProductFactory();
		List<Flyweight> sentence = createSentence(factory);
		String output = createSentenceOutput(sentence);
		
		System.out.println(output);
		System.out.println();
		System.out.println("Characters printed    : " + output.length());
		System.out.println("Characters in sentence: " + sentence.size());
		System.out.println("Characters created    : " + factory.getAmountOfCreatedObjects());
	}

	private static String createSentenceOutput(List<Flyweight> sentence) {
		StringBuilder sentencePrint = new StringBuilder();
		for(Flyweight current : sentence) {
			sentencePrint.append(current.getOutput("", ""));
		}
		return sentencePrint.toString();
	}

	private static List<Flyweight> createSentence(ProductFactory factory) {
		List<Flyweight> sentence = new ArrayList<>();
		sentence.add(new UnsharedConcreteFlyweight(5, 10));
		sentence.add(factory.getFlyweight('a'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('b'));
		sentence.add(factory.getFlyweight('a'));
		sentence.add(factory.getFlyweight('d'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('p'));
		sentence.add(factory.getFlyweight('r'));
		sentence.add(factory.getFlyweight('o'));
		sentence.add(factory.getFlyweight('c'));
		sentence.add(factory.getFlyweight('e'));
		sentence.add(factory.getFlyweight('s'));
		sentence.add(factory.getFlyweight('s'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('b'));
		sentence.add(factory.getFlyweight('e'));
		sentence.add(factory.getFlyweight('a'));
		sentence.add(factory.getFlyweight('t'));
		sentence.add(factory.getFlyweight('s'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('a'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('g'));
		sentence.add(factory.getFlyweight('o'));
		sentence.add(factory.getFlyweight('o'));
		sentence.add(factory.getFlyweight('d'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('p'));
		sentence.add(factory.getFlyweight('e'));
		sentence.add(factory.getFlyweight('r'));
		sentence.add(factory.getFlyweight('s'));
		sentence.add(factory.getFlyweight('o'));
		sentence.add(factory.getFlyweight('n'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('e'));
		sentence.add(factory.getFlyweight('v'));
		sentence.add(factory.getFlyweight('e'));
		sentence.add(factory.getFlyweight('r'));
		sentence.add(factory.getFlyweight('y'));
		sentence.add(factory.getFlyweight(' '));
		sentence.add(factory.getFlyweight('t'));
		sentence.add(factory.getFlyweight('i'));
		sentence.add(factory.getFlyweight('m'));
		sentence.add(factory.getFlyweight('e'));
		
		return sentence;
	}

}
