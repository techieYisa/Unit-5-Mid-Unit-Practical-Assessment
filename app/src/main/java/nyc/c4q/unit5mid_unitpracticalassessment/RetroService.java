package nyc.c4q.unit5mid_unitpracticalassessment;

import java.util.Map;

import nyc.c4q.unit5mid_unitpracticalassessment.model.DataModelResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by c4q on 1/24/18.
 */

public interface RetroService {
    @GET("/api/");
    Call<DataModelResponse> getResults(@QueryMap Map<String, String> queries);
}
