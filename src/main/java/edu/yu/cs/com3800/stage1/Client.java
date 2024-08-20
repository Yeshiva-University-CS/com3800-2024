package edu.yu.cs.com3800.stage1;

import java.io.IOException;

public interface Client {
    //public ClientImpl(String hostName, int hostPort) throws MalformedURLException
    class Response {
        private int code;
        private String body;
        private boolean cached;

        public Response(int code, String body) {
            this(code, body, false);
        }

        public Response(int code, String body, boolean cached) {
            this.code = code;
            this.body = body;
            this.cached = cached;
        }

        public int getCode() {
            return this.code;
        }

        public String getBody() {
            return this.body;
        }

        public boolean getCached() {
            return this.cached;
        }
    }

    void sendCompileAndRunRequest(String src) throws IOException;
    Response getResponse() throws IOException;
}