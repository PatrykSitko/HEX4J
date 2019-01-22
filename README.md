# HEX4J
A library written to simplify hexadecimal manipulation in Java(8).
Examples:

public class Example {
 public static void main(String[] args) {
          System.out.println("HEX From BYTE: " + Hexadecimal.From.Byte((byte) 'ï'));
          System.out.println("HEX To BYTE: " + (char) Hexadecimal.To.Byte("0xef"));
          System.out.println("HEX From BOOLEAN: " + Hexadecimal.From.Boolean(true) + ", From BOOLEAN: " + Hexadecimal.From.Boolean(false));
          System.out.println("HEX To BOOLEAN: " + Hexadecimal.To.Boolean("0x01") + ", To BOOLEAN: " + Hexadecimal.To.Boolean("0x00"));
          System.out.println("HEX From CHAR: " + Hexadecimal.From.Char('ï'));
          System.out.println("HEX to CHAR: " + Hexadecimal.To.Char("0xef"));
          System.out.println("HEX From CHAR-ARRAY: " + Hexadecimal.From.CharArray(new char[]{'P', 'a', 't', 'r', 'y', 'k', ' ', 'S', 'i', 't', 'k', 'o'}));
          System.out.println("HEX to CHAR-ARRAY: " + new String(Hexadecimal.To.CharArray("0x070006")));
          System.out.println("HEX From SHORT: " + Hexadecimal.From.Short((short) 12));
          System.out.println("HEX to SHORT: " + Hexadecimal.To.Short("0x0f"));
          System.out.println("HEX From INT: " + Hexadecimal.From.Int(Integer.MAX_VALUE));
          System.out.println("HEX to INT: " + Hexadecimal.To.Int("0x7FFFFFFF"));
          System.out.println("HEX From INT-SIGNED: " + Hexadecimal.From.Int(-232));
          System.out.println("HEX to INT-SIGNED: " + Hexadecimal.To.Int("0xFFFFFF18"));
          System.out.println("HEX From LONG: " + Hexadecimal.From.Long(123456789123456789l));
          System.out.println("HEX to LONG: " + Hexadecimal.To.Long("0x01 0xb6 0x9b 0x4b 0xac 0xd0 0x5f 0x15"));
          System.out.println("HEX From LONG-SIGNED: " + Hexadecimal.From.Long(-992137445608l));
          System.out.println("HEX to LONG-SIGNED: " + Hexadecimal.To.Long("0xFFFFFF18FFFFFF18"));
          System.out.println("HEX From FLOAT: " + Hexadecimal.From.Float(0.5f));
          System.out.println("HEX to FLOAT: " + Hexadecimal.To.Float("0x3f000000"));
          System.out.println("HEX From FLOAT-SIGNED : " + Hexadecimal.From.Float(-1f));
          System.out.println("HEX to FLOAT-SIGNED : " + Hexadecimal.To.Float("0xBF800000"));
          System.out.println("HEX From DOUBLE: " + Hexadecimal.From.Double(0.05d));
          System.out.println("HEX to DOUBLE   : " + Hexadecimal.To.Double("0x3fa999999999999a"));
          System.out.println("HEX From DOUBLE-SIGNED : " + Hexadecimal.From.Double(-0.1d));
          System.out.println("HEX to DOUBLE-SIGNED : " + Hexadecimal.To.Double("0xBFB999999999999A"));
      }
    }
