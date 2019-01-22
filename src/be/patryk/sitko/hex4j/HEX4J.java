/*
Author: Patryk Sitko.
Contact: sitko.patryk@outlook.com
 GNU LESSER GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.


  This version of the GNU Lesser General Public License incorporates
the terms and conditions of version 3 of the GNU General Public
License, supplemented by the additional permissions listed below.

  0. Additional Definitions.

  As used herein, "this License" refers to version 3 of the GNU Lesser
General Public License, and the "GNU GPL" refers to version 3 of the GNU
General Public License.

  "The Library" refers to a covered work governed by this License,
other than an Application or a Combined Work as defined below.

  An "Application" is any work that makes use of an interface provided
by the Library, but which is not otherwise based on the Library.
Defining a subclass of a class defined by the Library is deemed a mode
of using an interface provided by the Library.

  A "Combined Work" is a work produced by combining or linking an
Application with the Library.  The particular version of the Library
with which the Combined Work was made is also called the "Linked
Version".

  The "Minimal Corresponding Source" for a Combined Work means the
Corresponding Source for the Combined Work, excluding any source code
for portions of the Combined Work that, considered in isolation, are
based on the Application, and not on the Linked Version.

  The "Corresponding Application Code" for a Combined Work means the
object code and/or source code for the Application, including any data
and utility programs needed for reproducing the Combined Work from the
Application, but excluding the System Libraries of the Combined Work.

  1. Exception to Section 3 of the GNU GPL.

  You may convey a covered work under sections 3 and 4 of this License
without being bound by section 3 of the GNU GPL.

  2. Conveying Modified Versions.

  If you modify a copy of the Library, and, in your modifications, a
facility refers to a function or data to be supplied by an Application
that uses the facility (other than as an argument passed when the
facility is invoked), then you may convey a copy of the modified
version:

   a) under this License, provided that you make a good faith effort to
   ensure that, in the event an Application does not supply the
   function or data, the facility still operates, and performs
   whatever part of its purpose remains meaningful, or

   b) under the GNU GPL, with none of the additional permissions of
   this License applicable to that copy.

  3. Object Code Incorporating Material from Library Header Files.

  The object code form of an Application may incorporate material from
a header file that is part of the Library.  You may convey such object
code under terms of your choice, provided that, if the incorporated
material is not limited to numerical parameters, data structure
layouts and accessors, or small macros, inline functions and templates
(ten or fewer lines in length), you do both of the following:

   a) Give prominent notice with each copy of the object code that the
   Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the object code with a copy of the GNU GPL and this license
   document.

  4. Combined Works.

  You may convey a Combined Work under terms of your choice that,
taken together, effectively do not restrict modification of the
portions of the Library contained in the Combined Work and reverse
engineering for debugging such modifications, if you also do each of
the following:

   a) Give prominent notice with each copy of the Combined Work that
   the Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the Combined Work with a copy of the GNU GPL and this license
   document.

   c) For a Combined Work that displays copyright notices during
   execution, include the copyright notice for the Library among
   these notices, as well as a reference directing the user to the
   copies of the GNU GPL and this license document.

   d) Do one of the following:

       0) Convey the Minimal Corresponding Source under the terms of this
       License, and the Corresponding Application Code in a form
       suitable for, and under terms that permit, the user to
       recombine or relink the Application with a modified version of
       the Linked Version to produce a modified Combined Work, in the
       manner specified by section 6 of the GNU GPL for conveying
       Corresponding Source.

       1) Use a suitable shared library mechanism for linking with the
       Library.  A suitable mechanism is one that (a) uses at run time
       a copy of the Library already present on the user's computer
       system, and (b) will operate properly with a modified version
       of the Library that is interface-compatible with the Linked
       Version.

   e) Provide Installation Information, but only if you would otherwise
   be required to provide such information under section 6 of the
   GNU GPL, and only to the extent that such information is
   necessary to install and execute a modified version of the
   Combined Work produced by recombining or relinking the
   Application with a modified version of the Linked Version. (If
   you use option 4d0, the Installation Information must accompany
   the Minimal Corresponding Source and Corresponding Application
   Code. If you use option 4d1, you must provide the Installation
   Information in the manner specified by section 6 of the GNU GPL
   for conveying Corresponding Source.)

  5. Combined Libraries.

  You may place library facilities that are a work based on the
Library side by side in a single library together with other library
facilities that are not Applications and are not covered by this
License, and convey such a combined library under terms of your
choice, if you do both of the following:

   a) Accompany the combined library with a copy of the same work based
   on the Library, uncombined with any other library facilities,
   conveyed under the terms of this License.

   b) Give prominent notice with the combined library that part of it
   is a work based on the Library, and explaining where to find the
   accompanying uncombined form of the same work.

  6. Revised Versions of the GNU Lesser General Public License.

  The Free Software Foundation may publish revised and/or new versions
of the GNU Lesser General Public License from time to time. Such new
versions will be similar in spirit to the present version, but may
differ in detail to address new problems or concerns.

  Each version is given a distinguishing version number. If the
Library as you received it specifies that a certain numbered version
of the GNU Lesser General Public License "or any later version"
applies to it, you have the option of following the terms and
conditions either of that published version or of any later version
published by the Free Software Foundation. If the Library as you
received it does not specify a version number of the GNU Lesser
General Public License, you may choose any version of the GNU Lesser
General Public License ever published by the Free Software Foundation.

  If the Library as you received it specifies that a proxy can decide
whether future versions of the GNU Lesser General Public License shall
apply, that proxy's public statement of acceptance of any version is
permanent authorization for you to choose that version for the
Library.
 */
package be.patryk.sitko.hex4j;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Patryk Sitko
 */
public interface HEX4J {

    /*
    public static void main(String[] args) {
        System.out.println("HEX From BYTE: " + Hexadecimal.From.Byte((byte) 'ï'));
        System.out.println("HEX To BYTE: " + (char) Hexadecimal.To.Byte("0xef"));
        System.out.println("HEX From BOOLEAN: " + Hexadecimal.From.Boolean(true) + ", From BOOLEAN: " + Hexadecimal.From.Boolean(false));
        System.out.println("HEX To BOOLEAN: " + Hexadecimal.To.Boolean("0x01") + ", To BOOLEAN: " + Hexadecimal.To.Boolean("0x00"));
        System.out.println("HEX From CHAR: " + Hexadecimal.From.Char('ï'));
        System.out.println("HEX to CHAR: " + Hexadecimal.To.Char("0xef"));
        System.out.println("HEX From CHAR-ARRAY: " + Hexadecimal.From.CharArray(new char[]{'P', 'a', 't', 'r', 'y', 'k', ' ', 'S', 'i', 't', 'k', 'o'}));
        System.out.println("HEX to CHAR-ARRAY: " + new String(Hexadecimal.To.CharArray("0x50617472796B205369746B6F")));
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
     */
    /**
     *
     * @author Patryk Sitko
     */
    public static interface Hexadecimal {

        public static final char[] DIGITS = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        /**
         *
         * @author Patryk Sitko
         */
        public static interface From {

            /**
             *
             * @author Patryk Sitko
             */
            public static String Byte(byte b) {
                char[] array = {Hexadecimal.DIGITS[(b >> 4) & 0x0f], Hexadecimal.DIGITS[b & 0x0f]};
                return HEX4J.Private.checkIntegrity(new String(array).toUpperCase());
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Boolean(boolean boolValue) {
                return boolValue ? "01" : "00";
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Char(char charValue) {
                String hexadecimal = Integer.toHexString((int) charValue).toUpperCase();
                return hexadecimal.length() % 2 == 1 ? "0".concat(hexadecimal) : hexadecimal;
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String CharArray(char[] charValues) {
                StringBuilder builder = new StringBuilder();
                for (char value : charValues) {
                    builder.append(Char(value));
                }
                return builder.toString().toUpperCase();
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String String(String value) {
                return CharArray(value.toCharArray());
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Short(short shortValue) {
                return Int(shortValue);
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Int(int intValue) {
                String hex = Integer.toUnsignedString(intValue, 16);
                while (hex.length() < 8) {
                    hex = "0".concat(hex);
                }
                if (hex.length() > 8) {
                    hex = hex.substring(0, 7);
                }
                return hex.toUpperCase();
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Long(long longValue) {
                String hex = Long.toUnsignedString(longValue, 16);
                while (hex.length() % 2 != 0) {
                    hex = "0".concat(hex);
                }
                if (hex.length() > 16) {
                    hex = hex.substring(0, 15);
                }
                return hex.toUpperCase();
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Float(float floatValue) {
                return Int(Float.floatToIntBits(floatValue));
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String Double(double doubleValue) {
                return Long(Double.doubleToLongBits(doubleValue));
            }
        }

        /**
         *
         * @author Patryk Sitko
         */
        public static interface To {

            /**
             *
             * @author Patryk Sitko
             */
            public static byte Byte(String hexValue) {
                return DatatypeConverter.parseHexBinary(HEX4J.Private.checkIntegrity(hexValue))[0];
            }

            /**
             *
             * @author Patryk Sitko
             * @param hexValue
             * @return true if hexValue equals : 01 (/or 1); else return false;
             */
            public static boolean Boolean(String hexValue) {
                return Int(hexValue) == 1;
            }

            /**
             *
             * @author Patryk Sitko
             * @param hexValue (tot:1)MAX-HEX-VALUE: ff;
             * @return
             */
            public static char Char(String hexValue) {
                return (char) Int(hexValue);
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static char[] CharArray(String hexValue) {
                hexValue = HEX4J.Private.checkIntegrity(hexValue);
                char[] chars = new char[hexValue.length() / 2];
                for (int x = 0, current = 0; x < hexValue.length(); x += 2, current++) {
                    chars[current] = Char(hexValue.substring(x, x + 2));
                }
                return chars;
            }

            /**
             *
             * @author Patryk Sitko
             */
            public static String String(String hexValue) {
                return new String(CharArray(hexValue));
            }

            /**
             *
             * @param hexValue (tot:3)MAX-HEX-VALUE: 7f ff ff;
             * @return
             */
            public static short Short(String hexValue) {
                hexValue = HEX4J.Private.checkIntegrity(hexValue);
                return Short.decode("0x".concat(hexValue));
            }

            /**
             *
             * @param hexValue (tot:4)MAX-HEX-VALUE: 7f ff ff ff; MIN-HEX-VALUE:
             * @return
             */
            public static int Int(String hexValue) {
                hexValue = HEX4J.Private.checkIntegrity(hexValue);
                return Integer.parseUnsignedInt(hexValue, 16);
            }

            /**
             *
             * @param hexValue (tot:8)MAX-HEX-VALUE: 7f ff ff ff ff ff ff ff;
             * @return
             */
            public static long Long(String hexValue) {
                hexValue = HEX4J.Private.checkIntegrity(hexValue);
                return Long.parseUnsignedLong(hexValue, 16);
            }

            /**
             *
             * @param hexValue (tot:4)MAX-HEX-VALUE: ff ff ff ff;
             * @return
             */
            public static float Float(String hexValue) {
                return Float.intBitsToFloat((int) Long(hexValue));
            }

            /**
             *
             * @param hexValue
             * @return (tot:8)MAX-HEX-VALUE: ff ff ff ff ff ff ff ff;
             */
            public static double Double(String hexValue) {
                return Double.longBitsToDouble(Long(hexValue));
            }
        }

        /**
         *
         * @author Patryk Sitko
         */
        public static class Counter {

            private int counter;

            /**
             *
             * @param increaseCount
             * @return current hexadecimal count. IF increaseCount THEN return
             * current hexadecimal count and increase afterwards;
             */
            public String getCount(boolean increaseCount) {
                return Hexadecimal.From.Int(increaseCount ? counter++ : counter);
            }

            /**
             *
             * @author Patryk Sitko
             */
            public void resetCount() {
                counter = 0;
            }
        }
    }

    /**
     *
     * @author Patryk Sitko
     */
    public static interface FileReader {

        /**
         *
         * @author Patryk Sitko
         */
        public static String read(File file) {
            StringBuilder data = new StringBuilder();
            try ( BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                    for (Byte value : buffer) {
                        if (bytesRead-- <= 0) {
                            buffer = new byte[1024];
                            break;
                        }
                        data.append(Hexadecimal.From.Byte(value));
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
            return data.toString();
        }
    }

    /**
     *
     * @author Patryk Sitko
     */
    public static interface FileWriter {

        /**
         *
         * @author Patryk Sitko
         */
        public static boolean write(String hexadecimalString, File file) {
            try ( BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                ArrayList<String> hexadecimalValues = new ArrayList();
                hexadecimalString = HEX4J.Private.checkIntegrity(hexadecimalString);
                for (int x = 0; x < hexadecimalString.length(); x += 2) {
                    hexadecimalValues.add(hexadecimalString.substring(x, x + 2));
                }
                for (String hexadecimal : hexadecimalValues) {
                    out.write(Hexadecimal.To.Byte(hexadecimal));
                }
            } catch (IOException ex) {
                Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            return true;
        }

        /**
         *
         * @author Patryk Sitko
         */
        public static boolean writeHumanReadableFormat(String hexadecimalString, File file) {
            // TODO: Fix exception if hexes are not in pair. 
            // TODO: Fix not printing chars if count % 16 != 0.
            Hexadecimal.Counter hexCounter = new Hexadecimal.Counter();
            try ( java.io.FileWriter writer = new java.io.FileWriter(file)) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                ArrayList<String> hexadecimalValues = new ArrayList();
                hexadecimalString = HEX4J.Private.checkIntegrity(hexadecimalString);
                for (int x = 0; x < hexadecimalString.length(); x += 2) {
                    hexadecimalValues.add(hexadecimalString.substring(x, x + 2));
                }
                int count = 0;
                writer.write(hexCounter.getCount(true).concat("0\t"));
                ArrayList<Character> chars = new ArrayList();
                for (String hexadecimal : hexadecimalValues) {
                    writer.write(hexadecimal.concat(" "));
                    chars.add(Hexadecimal.To.Char(hexadecimal));
                    if (++count % 16 == 0 || count >= hexadecimalValues.size()) {
                        writer.write("\t");
                        for (Character c : chars) {
                            int index = c;
                            if ((index >= 65 && index <= 90) || (index >= 97 && index <= 122) || (index >= 48 && index <= 57) || (index >= 33 && index <= 47) || (index >= 58 && index <= 64) || (index >= 91 && index <= 96) || (index >= 122 && index <= 126)) {
                                writer.write(c.toString());
                            } else {
                                writer.write(".");
                            }
                        }
                        writer.write("\n".concat(hexCounter.getCount(true)).concat("0\t"));
                        chars.clear();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            return true;
        }
    }

    public class Private {

        public static String checkIntegrity(String hexValue) {
            hexValue = hexValue.replaceAll("0x", "").replaceAll("0X", "").replaceAll(" ", "");
            while (hexValue.length() % 2 != 0) {
                hexValue = "0".concat(hexValue);
            }
            return hexValue;
        }
    }
}
