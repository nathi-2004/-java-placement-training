class String
{
	public static void main(String[] args) {
	String input = "1101101101";
	StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {

			if (i < 6) {
				output.append('1');
			} else {
				output.append('0');
			}
		}

       	System.out.println("Input: " + input);
		System.out.println("Output: " + output.toString());
	}
}