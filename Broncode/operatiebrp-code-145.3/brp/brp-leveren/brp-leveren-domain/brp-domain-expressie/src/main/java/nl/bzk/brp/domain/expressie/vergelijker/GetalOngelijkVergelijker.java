/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.domain.expressie.vergelijker;

import nl.bzk.brp.domain.expressie.Expressie;
import nl.bzk.brp.domain.expressie.ExpressieType;
import nl.bzk.brp.domain.expressie.OperatorType;
import nl.bzk.brp.domain.expressie.BooleanLiteral;
import nl.bzk.brp.domain.expressie.GetalLiteral;
import org.springframework.stereotype.Component;

/**
 * {@link OperatorType#ONGELIJK} vergelijker voor {@link ExpressieType#GETAL} expressies.
 */
@Component
@VergelijkerConfig(operator = OperatorType.ONGELIJK, typeSupport = ExpressieType.GETAL)
final class GetalOngelijkVergelijker implements Vergelijker<GetalLiteral, GetalLiteral> {

    @Override
    public Expressie apply(final GetalLiteral l, final GetalLiteral r) {
        return BooleanLiteral.valueOf(l.getWaarde() != r.getWaarde());
    }
}
