import java.util.Stack;
class Interoperability {
	public static void pushItems(Stack stackParam, Object item) {
		stackParam.push(item);
	}
	public static void main(String args[]) {
		Stack<String> stackObj = new Stack<String>();
		stackObj.push("Paul");
		pushItems(stackObj, new Integer(77));
		String value = stackObj.pop();
		System.out.println(value);
	}
}
