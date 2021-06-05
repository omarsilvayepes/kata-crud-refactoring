package co.com.sofka.crud.service;

import co.com.sofka.crud.DAO.IntGroupListService;
import co.com.sofka.crud.entity.GroupList;
import co.com.sofka.crud.repository.GroupListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupListService implements IntGroupListService {

    @Autowired
    private GroupListRepository repository;

    @Override
    public Iterable<GroupList> list() {

        return repository.findAll();
    }

    @Override
    public GroupList save(GroupList groupList) {

        return repository.save(groupList);
    }

    @Override
    public void delete(Long id) {
        repository.delete(get(id));
    }

    @Override
    public GroupList get(Long id) {

        return repository.findById(id).orElseThrow();
    }
}
