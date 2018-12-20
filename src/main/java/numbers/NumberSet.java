package numbers;

import org.json.JSONObject;

public class NumberSet {

        private final long id;
        private final String content;
	RandomSet rs = new RandomSet();



        public NumberSet(long id, String content) {
                this.id = id;
                this.content = content;
        }

        public long getId() {
                return id;
        }

	public String getTimestamp() {
			// time in seconds
			String ts = Long.toString(System.currentTimeMillis() / 1000);
			return ts;
	}

	public String getHost() {
		return System.getenv("HOSTNAME");
	}

        public String getContent() {
                //rs.getRandomNumberSet().forEach((k,v) -> System.out.println(k + ", " + v));
                JSONObject jo = new JSONObject(rs.getRandomNumberSet());
                return jo.toString();
        }
}

