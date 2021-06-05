package co.com.sofka.crud.DAO;

import co.com.sofka.crud.entity.GroupList;

public interface IntGroupListService {
    Iterable<GroupList> list();
    GroupList save(GroupList groupList);
    void delete(Long id);
    GroupList get(Long id);
}
