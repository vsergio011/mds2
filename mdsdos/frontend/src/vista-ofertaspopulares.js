import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaOfertaspopulares extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-m);">
 <label style="align-self: center;">Ofertas</label>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="justify-content: center; align-self: center;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ofertaspopulares';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertaspopulares.is, VistaOfertaspopulares);
