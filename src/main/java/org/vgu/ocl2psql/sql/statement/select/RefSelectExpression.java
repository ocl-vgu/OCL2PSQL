/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/
package org.vgu.ocl2psql.sql.statement.select;

import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;

public class RefSelectExpression extends SelectExpressionItem{
    
    private String variableName;
    
    public RefSelectExpression(String variableName) {
        super();
        this.variableName = variableName;
        super.setAlias(new Alias("ref_".concat(variableName)));
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}
