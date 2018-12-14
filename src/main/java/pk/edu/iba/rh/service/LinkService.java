package pk.edu.iba.rh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.iba.rh.model.Link;
import pk.edu.iba.rh.repository.LinkRepository;
import pk.edu.iba.rh.utill.CrudOperation;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Service
public class LinkService implements CrudOperation<Link>{

    @Autowired
    private LinkRepository linkRepository;

    @Override
    public void save(Link link) {
        linkRepository.save(link);
    }

    @Override
    public void delete(Link link) {
        linkRepository.delete(link);
    }

    @Override
    public Link findById(Long id) {
        return linkRepository.findById(id).isPresent() ? linkRepository.findById(id).get() : null;
    }

    @Override
    public List<Link> findAll() {
        return linkRepository.findAllByOrderByLinkIdDesc();
    }
}
