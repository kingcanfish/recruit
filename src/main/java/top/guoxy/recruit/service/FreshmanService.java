package top.guoxy.recruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoxy.recruit.model.FreshmanModel;
import top.guoxy.recruit.repository.FreshmanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FreshmanService {
    @Autowired
    private FreshmanRepository repository;

    public List<FreshmanModel> getFreshmanList(int groupId) {
        if (groupId==0) {
            return repository.findAll();
        } else {
            return repository.findAllByGroupId(groupId);
        }
    }
    public FreshmanModel getFreshmanByID(int ID) throws Exception {
        Optional<FreshmanModel> optional = repository.findById(ID);
        return optional.orElseGet(FreshmanModel::new);
    }

}
