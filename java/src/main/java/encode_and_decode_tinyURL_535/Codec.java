package encode_and_decode_tinyURL_535;

import java.util.HashMap;
import java.util.Random;

public class Codec {
  String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  HashMap<String, String> map = new HashMap<>();
  Random rand = new Random();
  String key = getRand();

  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    while (map.containsKey(key)) {
      key = getRand();
    }
    map.put(key, longUrl);

    return "http://tinyurl.com/" + key;
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    return map.get(shortUrl.replace("http://tinyurl.com/", ""));
  }

  /**
   * Generates random key.
   * @return {String}
   */
  private String getRand() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 6; i++) {
      sb.append(alphabet.charAt(rand.nextInt(62)));
    }

    return sb.toString();
  }

}
