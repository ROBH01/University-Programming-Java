/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [17/10/2017]
 * Week 13
 * 
 * This is a programmed version on Mad Libs, which is a phrasal template game.
 * The program chose 1 random word from each Array: nouns, verbs, adjectives, adverbs;
 * and displays a single statement which is built in the following way: "Do you <verb> your <adjective> <noun> <adverb>"
 */

import java.util.Random;

public class MadLibs {

	public static void main(String[] args) {
		String[] nouns = {"towel", "keyboard", "monster", "monkey", "computer", "tablet", "modem", "screen", "mouse", "cat"};
		String[] verbs = {"run", "think", "buy", "create", "kill", "clean", "sell", "love", "destroy", "hide"};
		String[] adjectives = {"blue", "large", "crazy", "dark", "useless", "spacious", "clean", "messy", "dirty", "ugly"};
		String[] adverbs = {"quickly", "slowly", "carefully", "anytime", "badly", "uncertainty", "desperately", "wrongly", "sometimes", "anytime"};

		Random rand = new Random();
		System.out.println("Do you " + verbs[rand.nextInt(10)] + " your " + adjectives[rand.nextInt(10)] + " "
				 + nouns[rand.nextInt(10)] + " " + adverbs[rand.nextInt(10)] + "?");
	}
}