# HEX4J
A library written to simplify hexadecimal manipulation in Java(8).
Examples:
## 1.CONVERTING (From & To):
	- System.out.println("HEX From BYTE: " + HEX4J.Hexadecimal.From.Byte((byte) 'ï'));
	- System.out.println("HEX To BYTE: " + (char) HEX4J.Hexadecimal.To.Byte("0xef"));
        - System.out.println("HEX From DOUBLE-SIGNED : " + HEX4J.Hexadecimal.From.Double(-0.1d));
        - System.out.println("HEX to DOUBLE-SIGNED : " + HEX4J.Hexadecimal.To.Double("0xBFB999999999999A")); //0x prefix is optional
## 2.COUNTING:
         - HEX4J.Counter counter = new HEX4J.Counter();
         - System.out.println(counter.getCount(increaseCount::boolean));
## 3.READING & WRITING* FILES:
	- (Reads file content as hexadecimals)
        - String fileContentInHexFormat = HEX4J.FileReader.read(sourceFile.txt);
        - (*Does not write to file in hexadecimal format. Original file structure is kept.)
        - HEX4J.FileWriter.write(hexadecimalContent::String, destinationFile.txt::File);
        - (This method writes the content in a structured way)
        - HEX4J.FileWriter.writeHumanReadableFormat(hexadecimalContent::String, destinationFile.txt::File);
	Example:
	000000000	00 48 69 2c 20 6d 79 20 6e 61 6d 65 20 69 73 20 	.Hi,.my.name.is.
	000000010	50 61 74 72 79 6b 20 53 69 74 6b 6f 2e 20 49 20 	Patryk.Sitko..I.
	000000020	68 6f 70 65 20 74 68 61 74 20 49 20 68 61 76 65 	hope.that.I.have
	000000030	20 68 65 6c 70 65 64 20 79 6f 75 2e 			.helped.you.
	000000040
          
          
          
