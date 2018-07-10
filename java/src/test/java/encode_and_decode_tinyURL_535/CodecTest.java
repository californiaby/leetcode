package encode_and_decode_tinyURL_535;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodecTest {

  Codec codec = new Codec();

  String url = "http://www.google.com";

  @Test
  public void encode() {
    String link = codec.encode(url);
    System.out.println(link);
  }

  @Test
  public void decode() {
    String link = codec.decode(codec.encode(url));
    System.out.println(link);
  }
}