package top.guoxy.recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.guoxy.recruit.model.FreshmanModel;

import java.util.List;
import java.util.Optional;

public interface FreshmanRepository extends JpaRepository<FreshmanModel, Integer> {
    List<FreshmanModel> findAllByGroupId(int groupId);
}
