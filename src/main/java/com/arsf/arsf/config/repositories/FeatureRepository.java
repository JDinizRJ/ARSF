package com.arsf.arsf.config.repositories;
import com.arsf.arsf.config.models.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository <Feature, String>{
    List<Feature> findByIdApp(String idApp);

    @Query("SELECT f FROM Feature f WHERE f.idApp = :idApp AND f.idFeature NOT IN :featureList")
    List<Feature> returnByAppIdAndFeatureNotInList(@Param("idApp") String idApp, @Param("featureList") List<String> featureList);

}
