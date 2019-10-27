package com.exam.dao;

import java.util.List;


import com.exam.model.ReferenceDetails;

public interface ReferenceDetailsDao {
	public void storeReferenceDetails(ReferenceDetails referenceDetails);
	public ReferenceDetails save(ReferenceDetails entity);
	public ReferenceDetails update(ReferenceDetails entity);
	public boolean delete(long id);
	public ReferenceDetails getById(long id);
	public List<ReferenceDetails> getAll();
}
