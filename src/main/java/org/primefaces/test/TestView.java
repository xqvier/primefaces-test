package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView
    implements Serializable
{

    private static final long serialVersionUID = 7073152639597583238L;

    private String testString;

    private String selectedKey = "2";

    private List<EnclosingObject> myList = new ArrayList<EnclosingObject>();;

    @PostConstruct
    public void init()
    {
        testString = "Welcome to PrimeFaces!!!";

        MyObject myObject = new MyObject();
        myObject.setField1("A");
        myObject.setField2("B");
        EnclosingObject enclosingObj = new EnclosingObject();
        enclosingObj.setKey("1");
        enclosingObj.setMyObj(myObject);
        myList.add(enclosingObj);

        myObject = new MyObject();
        myObject.setField1("C");
        myObject.setField2("D");
        enclosingObj = new EnclosingObject();
        enclosingObj.setKey("2");
        enclosingObj.setMyObj(myObject);
        myList.add(enclosingObj);
    }

    public String getTestString()
    {
        return testString;
    }

    public void setTestString(String testString)
    {
        this.testString = testString;
    }

    /**
     * @return {@link #selectedKey}
     */
    public String getSelectedKey()
    {
        return selectedKey;
    }

    /**
     * @param pSelectedKey {@link #selectedKey}
     */
    public void setSelectedKey(String pSelectedKey)
    {
        selectedKey = pSelectedKey;
    }

    /**
     * @return {@link #myList}
     */
    public List<EnclosingObject> getMyList()
    {
        return myList;
    }

    /**
     * @param pMyList {@link #myList}
     */
    public void setMyList(List<EnclosingObject> pMyList)
    {
        myList = pMyList;
    }
}
