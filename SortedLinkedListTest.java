import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest {

	@Test
	public void givenANumbers_WhenAddedToList_ShouldBeSorted() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		SortedLinkedList myLinkedList = new SortedLinkedList();
		myLinkedList.sortedInsert (myFirstNode);
		myLinkedList.sortedInsert (mySecondNode);
		myLinkedList.sortedInsert(myThirdNode);
		myLinkedList.sortedInsert (myFourthNode);
		myLinkedList.adjustTail();
		boolean result = myLinkedList.head.equals(mySecondNode) &&  myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
		myLinkedList.printMyNodes();
	}
}