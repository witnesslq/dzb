package org.bbz.dzb.service;

import org.bbz.dzb.bean.Enterprise;
import org.bbz.dzb.bean.User;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.service.IdNameEntityService;

import java.util.List;

/**
 * Created by liulaoye on 16-10-25.
 * EnterpriseService
 */
@IocBean(fields = "dao")
public class EnterpriseService extends IdNameEntityService<User>{

    public Enterprise add( String name, String describe, String address ){
        Enterprise enterprise = new Enterprise();
        enterprise.setAddress( address );
        enterprise.setDescription( describe );
        enterprise.setName( name );
        return dao().insert( enterprise );
    }

    public List<Enterprise> getAll(){
//       QueryResult qr = new QueryResult();
//        return  qr.setList(dao().query( Enterprise.class, null, null );
        return dao().query( Enterprise.class,null,null );
    }

    public int delete( int id ){

        return dao().delete( id );
    }

    public void updateIgnoreNull( Enterprise enterprise ){
        dao().updateIgnoreNull( enterprise );
    }

}