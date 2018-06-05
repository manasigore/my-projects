
/**
 * PdfWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.bapu.webservice;

    /**
     *  PdfWebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PdfWebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PdfWebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PdfWebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for viewCustomerDetails method
            * override this method for handling normal response from viewCustomerDetails operation
            */
           public void receiveResultviewCustomerDetails(
                    com.bapu.webservice.PdfWebServiceStub.ViewCustomerDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewCustomerDetails operation
           */
            public void receiveErrorviewCustomerDetails(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    