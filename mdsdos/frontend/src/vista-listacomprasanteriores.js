import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaListacomprasanteriores extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label style="width: 100%; font-weight: bold; margin: var(--lumo-space-m); padding: var(--lumo-space-s);">Lista de compras anteriores</label>
 <vaadin-vertical-layout id="lPedidos" style="align-self: center; width: 100%; padding: var(--lumo-space-m);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listacomprasanteriores';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListacomprasanteriores.is, VistaListacomprasanteriores);
