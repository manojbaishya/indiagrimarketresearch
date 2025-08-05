package org.manojbaishya.indiagrimarketresearch.ceda;

import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.util.List;

public class CedaApi implements Api {

    private static final String BASE_URL = "https://api.ceda.ashoka.edu.in/v1/agmarknet";
    private final RestClient restClient;

    public CedaApi(String bearerToken) {

        restClient = RestClient.builder()
                .requestFactory(new JdkClientHttpRequestFactory())
                .baseUrl(BASE_URL)
                .defaultHeader("Authorization", "Bearer %s".formatted(bearerToken))
                .build();
    }
    @Override
    public List<Commodity> getCommodities() {
        String uri = "/commodities";
        String response = restClient.get()
                                    .uri(uri)
                                    .retrieve()
                                    .body(String.class);

        System.out.println(response);
        return List.of();
    }
    @Override
    public List<Geography> getGeographies() {
        return List.of();
    }
    @Override
    public List<Market> getMarkets() {
        return List.of();
    }
}
