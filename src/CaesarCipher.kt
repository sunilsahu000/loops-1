/* One of the first known examples of encryption was used by Julius Caesar. Caesar
needed to provide written instructions to his generals, but he didn’t want his enemies
to learn his plans if the message slipped into their hands. As result, he developed
what later became known as the Caesar Cipher.
The idea behind this cipher is simple (and as a result, it provides no protection
against modern code breaking techniques). Each letter in the original message is
shifted by 3 places. As a result, A becomes D, B becomes E, C becomes F, D
becomes G, etc. The last three letters in the alphabet are wrapped around to the
beginning: X becomes A, Y becomes B and Z becomes C. Non-letter characters are
not modified by the cipher.
Write a program that implements a Caesar cipher. Allow the user to supply the
message and the shift amount, and then display the shifted message. Ensure that
your program encodes both uppercase and lowercase letters. Your program should
also support negative shift values so that it can be used both to encode messages and
decode messages.*/

fun main(args: Array<String>) {
    val oneTo26 = "XYZABCDEFGHIJKLMNOPQRSTUVW"
    println(oneTo26[4])




  /*
      val alphabet = arrayOf<Char>('X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
            'P','Q','R','S','T','U','V','W')
   for (i in alphabet)
    println(i)
  for (msg in oneTo26) {
        println(msg)
    } */
}