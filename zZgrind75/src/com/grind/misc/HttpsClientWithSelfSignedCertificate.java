package com.grind.misc;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HttpsClientWithSelfSignedCertificate {
	
	static 
	{
		System.out.println("Test");
		//System.setProperty("javax.net.ssl.trustStore", "C:/Program Files/Java/jdk-17.0.7+7/bin/cacerts");
		//System.setProperty("javax.net.ssl.trustStore", "C:/Program Files/Java/jdk-17.0.7+7/lib/security/cacerts");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		//System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jdk-17.0.7+7\\lib\\security\\cacerts");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

	}

    public static void main(String[] args) throws Exception {
    	System.setProperty("javax.net.debug", "ssl");
    	//System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jdk-17.0.7+7\\lib\\security\\cacerts");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        // URL of the server with a self-signed certificate
        URL url = new URL("https://172.24.243.234:443/");

        // Disable SSL certificate validation
        //disableCertificateValidation();

        // Open a connection to the server
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        
        //connection.setHostnameVerifier((hostname, session) -> true);

        try {
            // Read the response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } finally {
            connection.disconnect();
        }
    }

    private static void disableCertificateValidation() throws Exception {
        // Create a trust manager that does not validate certificate chains
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[]{
                new javax.net.ssl.X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        // Install the all-trusting trust manager
        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create a hostname verifier that always returns true
        javax.net.ssl.HostnameVerifier allHostsValid = new javax.net.ssl.HostnameVerifier() {
            public boolean verify(String hostname, javax.net.ssl.SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }
}
