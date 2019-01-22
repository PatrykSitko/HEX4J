# HEX4J
A library written to simplify hexadecimal manipulation in Java(8).
Examples:
1.CONVERTING (From & To):
	System.out.println("HEX From BYTE: " + HEX4J.Hexadecimal.From.Byte((byte) 'ï'));
	System.out.println("HEX To BYTE: " + (char) HEX4J.Hexadecimal.To.Byte("0xef"));
          System.out.println("HEX From DOUBLE-SIGNED : " + HEX4J.Hexadecimal.From.Double(-0.1d));
          System.out.println("HEX to DOUBLE-SIGNED : " + HEX4J.Hexadecimal.To.Double("0xBFB999999999999A")); //0x prefix is optional
2.COUNTING:
          HEX4J.Counter counter = new HEX4J.Counter();
          System.out.println(counter.getCount(increaseCount::boolean));
3.READING & WRITING* FILES:
          String fileContentInHexFormat = HEX4J.FileReader.read(sourceFile.txt);
          (*Does not write to file in hexadecimal format. Original file structure is kept.)
          (Broken:)HEX4J.FileWriter.write(hexadecimalContent::String, destinationFile.txt::File);
          (This method writes the content in a structured way)
          (Broken:)HEX4J.FileWriter.writeHumanReadableFormat(hexadecimalContent::String, destinationFile.txt::File);
          
          
          
